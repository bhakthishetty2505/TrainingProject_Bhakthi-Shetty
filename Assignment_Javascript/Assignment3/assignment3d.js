
   var brands=["Aqua","Bisleri","RailWater","Kingfisher"];

   for(var index in brands){
     console.log('Brands=',brands[index]);
   }

 
   var fruits4 = [123,'PINEAPPLE',true,null,undefined];
      
   for(var element in fruits4){
     console.log(fruits4[element]);
   }

   var fruits5 = ["Mango",25,true,null,256,"Parrot",false];
     
    for(var index in fruits5){
         if(index==3)
         {
             break;
         }

         console.log(fruits5[index]);      
     }

   var fruits10 = ["Boeing","Fly Emirates",,"Jet Airways","Spice Jet"];

    for(var index in fruits10){     
        console.log(index,fruits10[index]);  
     } 

   var person3={
     name:"Mr.KUMAR",
     age:46,
    }
    
    for(var index in person3)
    {
        console.log(person3[index]);
    }
  
    var person4={
     name:"Mr.KUMAR",
     age:46,
     sex:"male",
    }
    
    for(var index in person4)
    {
        if(index=="sex"){
            break;
        }   
            console.log(person4[index]);
        
        
    }


    var person4={
     name:"Mr.KUMAR",
     age:46,
     sex:"male",
    }
    
    for(var index in person4)
    {
        if(index=="sex"){
            break;
        }   
        console.log(index);     
    }

    var fruits6 = ["Mango",25,true,null,256,"Parrot",false];
     
    for(var index in fruits6){
         if(index==fruits6.length-1)
         {
             break;
         }

         console.log(fruits6[index]);      
     }

     var fruits6 = ["Mango",25,true,null,256,"Parrot",false];
     
     for(var index in fruits6){
          if(index==(fruits6.length-1)/2)
          {
              continue;
          }
 
          console.log(fruits6[index]);      
      }