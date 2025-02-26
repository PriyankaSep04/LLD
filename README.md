# LLD
Low Level Design

## Parking Lot
 How many entrances (1 entry and 1 exit)? but code should be scalable <br>
 Parking spot should be nearest to entrance <br>


 #### Object
 Vehicle (Vehicle no,vehicle type (enum{two wheeler,three wheeler}))<br>
 Ticket (Entry time,Parking spot,Price)<br> 
 Entrance Gate (find parking space,update parking space,generate ticket)<br>
 Parking Spot (id,isEmpty,Vehicle,Price,type)<br>
 Exit Gate (Cost calculation,payment,update parking spot) <br>
 
 

 Different types of spot?
 Two Wheeler
 Four wheeler
 