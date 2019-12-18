import { Component, OnInit } from '@angular/core';
import { AuthService } from '../auth.service';
import { NgForm } from '@angular/forms';

@Component({
  selector: 'app-add-asset',
  templateUrl: './add-asset.component.html',
  styleUrls: ['./add-asset.component.css']
})
export class AddAssetComponent implements OnInit {

  error: string;
  constructor(private auth: AuthService) { }

  addAsset(form: NgForm) {
    this.error = null;
    this.auth.addAssetUser(form.value)
      .subscribe(res => {
        console.log(res);
        form.reset();
      }, err => {
        console.log(err);
        this.error = err.error.message;
      });
  }

  ngOnInit() {
  }

}
