export class Proyectos {
    id: number;
    nombreP: string;
    descripcionP: string;
    anoP: string;
    imgP: string;

    constructor(nombreP: string, descripcionP: string, anoP: string, imgP: string){
        this.nombreP = nombreP;
        this.descripcionP= descripcionP;
        this.anoP=anoP;
        this.imgP = imgP;
    }
}
