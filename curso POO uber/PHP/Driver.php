<?php
    class Driver extends Account{
        public function __construct($name, $document){
            parent::__construct($name, $document);
        }
    
        public function print_data_driver(){
            echo"<br>";
            echo"Driver";
            echo"</br>";
            echo "| Name: $this->name | Document: $this->document | ";
        }
    }
?>