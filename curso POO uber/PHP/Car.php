<?php
    require_once('Account.php');
    class Car {
        public $id;
        public $license;
        public $driver;
        protected $passenger; // Es importante que esta propiedad esté marcada como protected

        public function __construct($license, $driver){
            $this->license = $license;
            $this->driver = $driver;
        }

        public function print_data_car(){
            echo "| License: $this->license,| Driver: {$this->driver->name}, | Document: {$this->driver->document}"."</br>";
        }
    }
?>
