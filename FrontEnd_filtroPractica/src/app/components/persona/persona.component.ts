import { Component, OnInit } from '@angular/core';
import {Personal} from 'src/app/models/personal.model';
import { RegionService } from 'src/app/services/region.service';
import { PersonalService } from 'src/app/services/personal.service';

@Component({
  selector: 'app-persona',
  templateUrl: './persona.component.html',
  styleUrls: ['./persona.component.css']
})
export class PersonaComponent implements OnInit {

nombres:string="";
trabajo:string="";
correo:string="";
selregion:number =-1;

region:string[] = [];

personal: Personal[] = [];

  constructor(private regionService:RegionService, private personalService:PersonalService) {
    this.regionService.listaregiones().subscribe(
      x =>this.region = x
    );
  }
ConsultarPersonal(){
  this.personalService.listarPersonal(this.nombres,this.trabajo,this.correo, this.selregion).subscribe(
    x=> this.personal = x
  );
}



  ngOnInit(): void {
  }

}
