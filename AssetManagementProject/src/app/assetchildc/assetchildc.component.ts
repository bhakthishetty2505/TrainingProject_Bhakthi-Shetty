import { Component, OnInit, Input } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';

@Component({
  selector: 'app-assetchildc',
  templateUrl: './assetchildc.component.html',
  styleUrls: ['./assetchildc.component.css']
})
export class AssetchildcComponent implements OnInit {

  @Input() car: { imgUrl: string, name: string };

  constructor(private http: HttpClient) { }

  ngOnInit() {
  }

  raiseReqAsset(form) {
    this.http.post('http://localhost:8080/assetmanagement/raiseReq', form,
      { headers: new HttpHeaders({ 'Content-Type': 'application/json' }) }).subscribe(response => {
        console.log(response);
        form.reset();
      }, err => {
        console.log(err);
      });
  }
}
