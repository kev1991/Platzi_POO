class Car{

    constructor (lincense, driver){
        this.id;
        this.lincense =lincense;
        this.drive = driver;
        this.passenger;
    }

    print_data_car = function(){
        console.log(this.drive);
        console.log(this.drive.name);
        console.log(this.drive.document);
    }
}    
