import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class ClientService {

  constructor(private http: HttpClient) { }

  url: string = 'http://localhost:8080/clientinfo/clientinfo';

  selectedClient: any = {
    clientId: null,
    clientName: null,
    clientLogo: null,
    clienShortName: null,
    deptName: null,
    clientNo: null,
    clientEmail: null,
    compWebSite: null,
    streetAddress: null,
    addressLine2: null,
    city: null,
    state: null,
    zipCode: null,
    country: null
  };
  postData(client) {
    return this.http.post(`${this.url}`, client);
  }
  updateData(client) {
    return this.http.put(`${this.url}`, client);
  }
  getClientData() {
    return this.http.get<any>(`${this.url}`);
  }
  deleteClientData(data) {
    return this.http.delete(`${this.url}/${data.clientId}`)
  }
  getAllDetails() {
    return this.http.get('http://localhost:8080/clientinfo/getAllComp');
  }

  getCount(){
    return this.http.get<any>('http://localhost:8080/clientinfo/getcount');
  }
  getDetailsWithId(clientId): Observable<any> {

    return this.http.get(`${'http://localhost:8080/clientinfo/getStackDetails'}/${clientId}`)
  }

  getStackDeatis(compId): Observable<any> { 
          return this.http.get(`${'http://localhost:8080/clientinfo/getStackCount'}/${compId}`)
  }

}
