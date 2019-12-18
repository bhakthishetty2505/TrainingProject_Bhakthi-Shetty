import { Component, OnInit } from '@angular/core';
import { AuthService } from '../auth.service';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-userrequest',
  templateUrl: './userrequest.component.html',
  styleUrls: ['./userrequest.component.css']
})
export class UserrequestComponent implements OnInit {

  requestedAsset;
  constructor(private http: HttpClient) {
    http.get<any>('http://localhost:8080/assetmanagement/requestedAsset').subscribe(response => {
      console.log(response);
      this.requestedAsset = response.assets;
    }, err => {
      console.log(err);
    });
  }

  ngOnInit() {
  }

  approvedAsset(request) {
    this.http.post('http://localhost:8080/assetmanagement/approveAsset', request).subscribe(response => {
      console.log(response);
    }, err => {
      console.log(err);
    });
  }


  rejectAsset(request) {
    this.http.post('http://localhost:8080/assetmanagement/rejectAsset', request).subscribe(response => {
      console.log(response);
    }, err => {
      console.log(err);
    });
  }

}
