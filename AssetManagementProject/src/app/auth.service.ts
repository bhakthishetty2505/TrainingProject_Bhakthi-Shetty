import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { HttpClient, HttpHeaders } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class AuthService {

  constructor(private http: HttpClient) { }

  registerUser(user): Observable<any> {
    return this.http.post('http://localhost:8080/assetmanagement/register', user);
  }

  loginUser(user): Observable<any> {
    return this.http.post('http://localhost:8080/assetmanagement/login', user);
  }

  addAssetUser(user): Observable<any> {
    return this.http.post('http://localhost:8080/assetmanagement/addAsset', user);
  }

  updateAsset(user): Observable<any> {
    return this.http.put('http://localhost:8080/assetmanagement/updateAsset', user,
      { headers: new HttpHeaders({ 'Content-Type': 'application/json' }) });
  }

  deleteAsset(user): Observable<any> {
    console.log('service message' + user);
    return this.http.delete('http://localhost:8080/assetmanagement/delete?assetId=' + user);
  }
}
