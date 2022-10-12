import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { RouterModule, Routes } from '@angular/router';
import {PersonaComponent}from "./components/persona/persona.component"
import {PruebaComponent} from "./components/prueba/prueba.component"


const routes: Routes = [
  {path : "Filtro" , component: PersonaComponent},
  {path: "Prueba" , component :PruebaComponent }
];


@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})

export class AppRoutingModule { }
