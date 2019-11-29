function fib(num)
        {
            var a = 0;
            var b = 1;
            var sum = 0;
            var temp=0;

            console.log("0");
            console.log("1")

            for(var i=2;i<num;i++)
            {
                sum=a+b;
                a=b;
                console.log(sum);
                b=sum;
                sum=sum+i;
                
            }

            console.log("sum=",sum);
        }
        fib(5);


        var two = function(num)
        {
            var a = 0;
            var b = 1;
            var sum = 0;
            var temp=0;

            console.log("0");
            console.log("1")

            for(var i=2;i<num;i++)
            {
                sum=a+b;
                a=b;
                console.log(sum);
                b=sum;
                sum=sum+i;
                
            }

            
            console.log("sum=",sum);
        } 
        
        two(5);

        var two = (function(num)
        {
            var a = 0;
            var b = 1;
            var sum = 0;
            var temp=0;

            console.log("0");
            console.log("1")

            for(var i=2;i<num;i++)
            {
                sum=a+b;
                a=b;
                console.log(sum);
                b=sum;
                sum=sum+i;
                
            }

            
            console.log("sum=",sum);
        }) (5);


        var two1 = (num)=>
        {
            var a = 0;
            var b = 1;
            var sum = 0;
            var temp=0;

            console.log("0");
            console.log("1")

            for(var i=2;i<num;i++)
            {
                sum=a+b;
                a=b;
                console.log(sum);
                b=sum;
                sum=sum+i;
                
            }

            
            console.log("sum=",sum);
        } 
        
        two1(5);