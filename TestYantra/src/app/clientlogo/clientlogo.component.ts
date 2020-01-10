import { Component, OnInit } from '@angular/core';
import { ClientService } from '../client.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-clientlogo',
  templateUrl: './clientlogo.component.html',
  styleUrls: ['./clientlogo.component.css']
})
export class ClientlogoComponent implements OnInit {

  clients:any;
  countList: any;
  countEmp: any;
  constructor(private service : ClientService, private route: Router) { 
    this.getData();
    this. getEmpCount();

  }

  getData() {
    this.service.getClientData().subscribe(res => {
      this.clients = res;
      console.log(this.clients.listclients);
      this.clients = this.clients.listclients;
      console.log(this.clients)
    })
  }

  getEmpCount(){
    this.service.getCount().subscribe(data => {
      this.countEmp = data;
      console.log('employee count', this.countEmp)
      this.countEmp = this.countEmp.countMap;
      console.log('praveennnnn',this.countEmp);
      console.log('employee count 2nd time', this.countEmp)
     
    });
  }
  chartData(clientId) {
    console.log('id of company',clientId);
    this.service.getDetailsWithId(clientId).subscribe (responce =>{
    localStorage.setItem('results', JSON.stringify(responce));
    });
    this.service.getStackDeatis(clientId).subscribe (stackCount => {
      console.log('stack count of emp::', stackCount)
      localStorage.setItem('countStack', JSON.stringify(stackCount));

    })  
    this.route.navigateByUrl("/clidata");
  }
  getBillables(clientId) {
    console.log('id of company bill',clientId);
    this.service.getDetailsWithId(clientId).subscribe (results =>{
    localStorage.setItem('billables', JSON.stringify(results));
     this.route.navigateByUrl("/billdata");
    });
    
  }

  

  ngOnInit() {
  }

}
