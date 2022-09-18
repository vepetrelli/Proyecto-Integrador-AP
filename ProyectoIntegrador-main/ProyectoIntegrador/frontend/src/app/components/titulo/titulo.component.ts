
import { Component, OnInit } from '@angular/core';
import { Titulo } from 'src/app/model/titulo';
import { TituloService } from 'src/app/service/titulo.service';
import { TokenService } from 'src/app/service/token.service';

@Component({
  selector: 'app-titulo',
  templateUrl: './titulo.component.html',
  styleUrls: ['./titulo.component.css']
})
export class TituloComponent implements OnInit {
  tit: Titulo[] = [];

  constructor(private tituloS: TituloService, private tokenService: TokenService) { }
  isLogged= false;

  ngOnInit(): void {
    this.cargarTitulo();
    if(this.tokenService.getToken()){
      this.isLogged = true;
    } else{this.isLogged = false;}
  }

  cargarTitulo():void {
    this.tituloS.lista().subscribe(
      data => {this.tit = data;}
    )
  }

  delete(id:number){
    if(id!=undefined){
      this.tituloS.delete(id).subscribe(data => {this.cargarTitulo();
      }, err => {
        alert("No se pudo eliminar")
      })
    }
  }
}