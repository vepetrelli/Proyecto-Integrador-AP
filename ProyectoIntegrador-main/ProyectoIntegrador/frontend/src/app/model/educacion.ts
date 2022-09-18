export class Educacion {
    id: number;
    nombreE: string;
    descripcionE: string;
    anoE: string;
    imgE: string;

    constructor(nombreE: string, descripcionE: string, anoE: string, imgE: string){
        this.nombreE = nombreE;
        this.descripcionE= descripcionE;
        this.anoE=anoE;
        this.imgE=imgE;
    }
}

