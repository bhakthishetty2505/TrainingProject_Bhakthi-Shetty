import { Component, OnInit } from '@angular/core';
import { AuthService } from '../auth.service';
import { Router } from '@angular/router';
import { NgForm } from '@angular/forms';

@Component({
  selector: 'app-delete-asset',
  templateUrl: './delete-asset.component.html',
  styleUrls: ['./delete-asset.component.css']
})
export class DeleteAssetComponent implements OnInit {

  error: string;
  constructor(private auth: AuthService, private router: Router) { }

  deleteAsset(form: NgForm) {
    console.log(form.value.assetId);
    this.auth.deleteAsset(form.value.assetId).subscribe(data => {
      console.log('deleteAsset', data);
      if (data && data.message === 'deleted') {
        localStorage.setItem('deletedAsset', JSON.stringify(data));
        this.router.navigateByUrl('manager');
      }
      form.reset();
    }, err => {
      console.log(err);
      this.error = err.error.message;
    });

  }

  ngOnInit() {
  }

}
