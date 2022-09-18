export class Titulo {
        id: number;
        profesion: string;
        descripcion: string;
        img: string;
    
        constructor(profesion: string, descripcion: string, img: string){
            this.profesion = profesion;
            this.descripcion= descripcion;
            this.img=img;
        }
    }
