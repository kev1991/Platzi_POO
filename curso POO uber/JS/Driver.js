class Driver extends Account{
    constructor(name, document, email, password){
        super(name, document, email, password)
    }

    print_data_user(){
        console.log(`Name: ${this.name}`);
        console.log(`Document: ${this.document}`);
        console.log(`Email: ${this.email}`);
        console.log(`Password: ${this.password}`);
    }
}