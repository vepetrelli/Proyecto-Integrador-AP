import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { EditeducacionComponent } from './components/educacion/editeducacion.component';
import { NeweducacionComponent } from './components/educacion/neweducacion.component';
import { EditExperienciaComponent } from './components/experiencia/edit-experiencia.component';
import { NewExperienciaComponent } from './components/experiencia/new-experiencia.component';
import { HomeComponent } from './components/home/home.component';
import { LoginComponent } from './components/login/login.component';
import { EditproyectosComponent } from './components/proyectos/editproyectos.component';
import { NewproyectosComponent } from './components/proyectos/newproyectos.component';
import { EditskillsComponent } from './components/skills/editskills.component';
import { NewskillsComponent } from './components/skills/newskills.component';
import { EdittituloComponent } from './components/titulo/edittitulo.component';
import { NewtituloComponent } from './components/titulo/newtitulo.component';


const routes: Routes = [
  {path: '', component:HomeComponent},
  {path: 'login', component:LoginComponent},
  {path: 'nuevaexp', component:NewExperienciaComponent},
  {path: 'editexp/:id', component:EditExperienciaComponent},
  {path: 'nuevaedu', component:NeweducacionComponent},
  {path: 'editedu/:id', component:EditeducacionComponent},
  {path: 'nuevoproy', component:NewproyectosComponent},
  {path: 'editproy/:id', component:EditproyectosComponent},
  {path: 'nuevaski', component:NewskillsComponent},
  {path: 'editski/:id', component:EditskillsComponent},
  {path: 'update/:id', component:EdittituloComponent},
  {path: 'nuevo', component:NewtituloComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
