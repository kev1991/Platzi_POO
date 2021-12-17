<?php
class Car {
    public $id = integer;
    public $license = string;
    public $driver = string;
    public $passengers = integer;

    public function__construct($license,$driver){
        $this->license = $license;
        $this->driver = $driver;
    }

    public function print_data_car(){
        echo "license: $this->license, driver: {$this->driver->name}, document: {$this->driver->document}";
    }
}