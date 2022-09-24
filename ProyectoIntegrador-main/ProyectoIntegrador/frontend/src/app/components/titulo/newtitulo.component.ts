import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Titulo } from 'src/app/model/titulo';
import { TituloService } from 'src/app/service/titulo.service';


@Component({
  selector: 'app-newtitulo',
  templateUrl: './newtitulo.component.html',
  styleUrls: ['./newtitulo.component.css'],  
})

export class NewtituloComponent implements OnInit {
  profesion: string;
  descripcion: string;
  img: string;

  constructor(private tituloS: TituloService, private router: Router) { }

  ngOnInit(): void {
  }

    onCreate():void {
      const titulo = new Titulo(this.profesion, this.descripcion, this.img);
      this.tituloS.save(titulo).subscribe(
        data => {alert("Edicion añadida correctamente");
      this.router.navigate(['']);
    }, err => {alert("falló");
    this.router.navigate(['']);
        }
      )
    }
}
