import { Component, OnInit } from '@angular/core';
import { BillService } from '../bill.service';

@Component({
  selector: 'app-pakagedetails',
  templateUrl: './pakagedetails.component.html',
  styleUrls: ['./pakagedetails.component.css']
})
export class PakagedetailsComponent implements OnInit {
  items: any = [];

  constructor(private service2: BillService) {
    this.getClientDetails();
  }

  private packageDetail: any = [];

  getClientDetails() {
    this.service2.getBillData().subscribe(details => {
      this.items = details;
      console.log(this.packageDetail);
    }, err => {
      console.log(err);
    }, () => {
      console.log("packageDetail got successfully");
    })
  }

  onChangePage(packageDetail: Array<any>) {
    this.packageDetail = packageDetail;
  }

  ngOnInit() {
    this.items = Array(168).fill(0).map((x, i) => ({ id: (i + 1), name: `${i + 1}` }));

  }

}