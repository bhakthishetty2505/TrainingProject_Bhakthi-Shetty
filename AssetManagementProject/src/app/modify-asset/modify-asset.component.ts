import { Component, OnInit } from '@angular/core';
import { AuthguardService } from '../authguard.service';
import { Router } from '@angular/router';
import { NgForm } from '@angular/forms';
import { AuthService } from '../auth.service';

@Component({
  selector: 'app-modify-asset',
  templateUrl: './modify-asset.component.html',
  styleUrls: ['./modify-asset.component.css']
})
export class ModifyAssetComponent implements OnInit {

  error: string;
  constructor(private auth: AuthService) { }

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
