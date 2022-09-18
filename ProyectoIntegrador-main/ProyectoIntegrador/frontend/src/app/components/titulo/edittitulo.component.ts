import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { Titulo } from 'src/app/model/titulo';
import { TituloService } from 'src/app/service/titulo.service';

@Component({
  selector: 'app-edittitulo',
  templateUrl: './edittitulo.component.html',
  styleUrls: ['./edittitulo.component.css']
})
export class EdittituloComponent implements OnInit {
  titulo: Titulo= null;

  constructor(
    private tituloS: TituloService,
  private activatedRouter: ActivatedRoute,
  private router: Router
  ) { }

  ngOnInit(): void {
    const id=this.activatedRouter.snapshot.params['id'];
    this.tituloS.detail(id).subscribe(
      data => {
        this.titulo = data;
      }, err => {alert("Error al modificar");
    this.router.navigate(['']);
  }
    )
  }

  onUpdate(): void {
    const id=this.activatedRouter.snapshot.params['id'];
    this.tituloS.update(id, this.titulo).subscribe(
      data => {
        this.router.navigate(['']);
      }, err => {alert("Error al modificar");
    this.router.navigate(['']);
  }
    )
  }
}

