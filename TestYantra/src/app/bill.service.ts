import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class BillService {

  constructor(private http: HttpClient) { }
  urlbill:string= 'http://localhost:8080/billable/billable';
  array;
  selectedBillable:any={
    empName:null,
    deployementDate:null,
    contractEndDate:null,
    rateCardPerMonth:null,
    stack:null,
    yoe:null
  }
 postData(bill) {
    return this.http.post(`${this.urlbill}`, bill);
  }
  updateData(bill) {
    return this.http.put(`${this.urlbill}`, bill);
  }
  getBillData() {
    return this.http.get(`${this.urlbill}`);
  }

  deleteClientData(data) {
    return this.http.delete(`${this.urlbill}/${data.employeeId}`)
  }

  getBills(): Observable<any> {

    return this.http.get('http://localhost:8080/billable/getbill');
  }

  getStackCount(): Observable<any> {

    return this.http.get('http://localhost:8080/billable/stackCountMap')
  }

}
