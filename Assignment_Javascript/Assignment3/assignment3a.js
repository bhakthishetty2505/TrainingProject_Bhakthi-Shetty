var fruits1 = [123,'PINEAPPLE','BANANA'];

        for(var i=0 ; i<fruits1.length ; i++)
        {
            console.log(fruits1[i]);
        }


        var fruits4 = [123,'PINEAPPLE',true,null,undefined];

        for(var i=0 ; i < fruits4.length+1 ; i++)
        {
            console.log(fruits4[i]);
        }


        var fruits5 = ["Mango",25,true,null,256,"Parrot",false];

        for(var i=0 ; i<=7 ; i++)
        {
            if(i==7)
            {
                fruits5[i]="Bugati";
                console.log(fruits5[i]);
                break;
            }
              
            console.log(fruits5[i]);
        }

        
        var fruits6 = ["Morning",25,true,580,89];
        
        console.log(fruits6[0]);
        console.log(fruits6[(fruits6.length-1)/2]);
        console.log(fruits6[fruits6.length-1]);
        
        for(var i=0 ; i<(fruits6.length-1)/2 ; i++)
        {
            console.log(fruits6[i]);
        }
        
        var fruits7 = ["Boeing","Fly Emirates",,"Jet Airways","Spice Jet"];

        for(var i=(fruits7.length-1)/2; i<fruits7.length ; i++ )
        {
            console.log(fruits7[i]);
        }
        
        
        var fruits8 = "I am SUPRITH";
        var red = "";

        for(var i=0 ; i<fruits8.length ; i++)
        {
             red=red+fruits8[i];
        }
        console.log(red);


        var fruits10 = ["Boeing","Fly Emirates",,"Jet Airways","Spice Jet"];

        for(var i=0; i<fruits10.length ; i++ )
        {
            
            console.log(i,fruits10[i]);
        }

        var fruits11 = ["Boeing","Fly Emirates",,"Jet Airways","Spice Jet"];
        
          for (i = 0; i < 5; i++) {
             
          }

          console.log(fruits11);
        
        var cars = ["BMW", "Volvo", "Saab", "Ford"];
        var i;
        for (i = 0, len = cars.length, text = ""; i < len; i++) {
              text += cars[i] +",";
        }
        console.log(text);