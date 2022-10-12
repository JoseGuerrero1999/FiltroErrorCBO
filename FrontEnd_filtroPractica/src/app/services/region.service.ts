import { Injectable } from '@angular/core';
import { AppSettings } from '../app.settings';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';


const baseUrl =  AppSettings.API_ENDPOINT + "/descripcion";
@Injectable({
  providedIn: 'root'
})
export class RegionService {

  constructor(private http: HttpClient) { }

  listaregiones(): Observable<string[]>{
    return this.http.get<string[]>(baseUrl+ '/listapaises');
  }



}
