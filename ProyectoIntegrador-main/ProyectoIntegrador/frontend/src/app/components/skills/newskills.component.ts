import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Skills } from 'src/app/model/skills';
import { SkillsService } from 'src/app/service/skills.service';

@Component({
  selector: 'app-newskills',
  templateUrl: './newskills.component.html',
  styleUrls: ['./newskills.component.css']
})
export class NewskillsComponent implements OnInit {
  nombreS: string;
  porcentajeS: number;
  imgS: string;

  constructor(private skillsS: SkillsService, private router: Router) { }

  ngOnInit(): void {
  }

    onCreate():void {
      const skills = new Skills(this.nombreS, this.porcentajeS, this.imgS);
      this.skillsS.save(skills).subscribe(
        data => {alert("Skill añadida correctamente");
      this.router.navigate(['']);
    }, err => {alert("falló");
    this.router.navigate(['']);
        }
      )
    }
}
