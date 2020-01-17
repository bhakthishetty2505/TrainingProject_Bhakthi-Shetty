import { Component, OnInit } from '@angular/core';
import { ClientService } from '../client.service';
import { Router } from '@angular/router';
import { BillService } from '../bill.service';

@Component({
  selector: 'app-billable-details',
  templateUrl: './billable-details.component.html',
  styleUrls: ['./billable-details.component.css']
})
export class BillableDetailsComponent implements OnInit {
  items: any=[];

  constructor(private service: BillService, private router: Router) { 
this.getBillable();

  }
  private Billabledetailes: any = [];
  billable: any = [];
        clients;
  getBillable() {
    let getmyVal: any = JSON.parse(localStorage.getItem("billables"));
    console.log('details in billables::', getmyVal);
    this.clients = getmyVal;
    console.log(this.clients.listBill);
    this.clients = this.clients.listBill;
  } 

  delete(data) {
    console.log('my data::',data)
    this.service.deleteClientData(data).subscribe(res => {
      console.log(res);
      console.log('data deleted')
      this.getBillable();
      this.router.navigateByUrl("/billdata")
    })
  }
  update(data) {
    console.log(data);
    console.log('data updated')
    this.service.selectedBillable = data;
    this.router.navigateByUrl("/billable");
  }
  
  ngOnInit() {
    
  }

}