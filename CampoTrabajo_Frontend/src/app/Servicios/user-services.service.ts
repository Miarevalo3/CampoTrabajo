import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { User } from '../Modelos/user';


 const baseUrl = 'http://localhost:8080/api/v1/Register';

@Injectable({
  providedIn: 'root'
})
export class UserServicesService {
  
  private baseUrl2 = 'http://localhost:8080/api/v1/Login';

  constructor(private http: HttpClient) { }


  registerUser(data: any): Observable<Object> {
    console.log(data);
    return this.http.post(baseUrl,data);
  }

    loginuser(user : User): Observable<Object>{
      console.log(user);
      return this.http.post(`${this.baseUrl2}`,user)
    }

}
