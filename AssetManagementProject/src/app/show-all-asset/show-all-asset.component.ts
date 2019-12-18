import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { NgForm } from '@angular/forms';
import { AuthService } from '../auth.service';

@Component({
  selector: 'app-show-all-asset',
  templateUrl: './show-all-asset.component.html',
  styleUrls: ['./show-all-asset.component.css']
})
export class ShowAllAssetComponent implements OnInit {

  error: string;
  list;
  constructor(private http: HttpClient, private auth: AuthService) {
    http.get<any>('http://localhost:8080/assetmanagement/allasset').subscribe(response => {
      console.log(response);
      this.list = response.getAllDetails;
    }, err => {
      console.log(err);
    });
  }

  modifyAsset(modifyAssetForm: NgForm) {
    this.error = null;
    this.auth.updateAsset(modifyAssetForm.value)
      .subscribe(res => {
        console.log(res);
        modifyAssetForm.reset();
      }, err => {
        console.log(err);
        this.error = err.error.message;
      });
  }

  ngOnInit() {
  }

}
