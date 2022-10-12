import { HttpClient, HttpParams } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { AppSettings } from '../app.settings';

const baseUrl = AppSettings.API_ENDPOINT + "/personal";
@Injectable({
  providedIn: 'root'
})
export class PersonalService {

  constructor(private http: HttpClient) { }

  listarPersonal(nombres: string, trabajo:string,correo:string ,region:number):Observable<any>{
    const params = new HttpParams().set("nombres",nombres).set("trabajo",trabajo).set("correo",correo).set("region",region);
    return this.http.get (baseUrl +"/filtro" , {params});
  }

}
