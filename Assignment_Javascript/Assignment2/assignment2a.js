function fact(num)
{
    var   res=1;
    for(var i=1;i<=num;i++)
    {
        res = res * i;
    }

    console.log(res);

}
fact(4);


var four = function(num)
{
    var   res=1;
    for(var i=1;i<=num;i++)
    {
        res = res * i;
    }

    console.log(res);

}

four(4)

var five=(function(num)
{
    var   res=1;
    for(var i=1;i<=num;i++)
    {
        res = res * i;
    }

    console.log(res);
}
)(4)


var six=(num)=>
{
    var   res=1;
    for(var i=1;i<=num;i++)
    {
        res = res * i;
    }

    console.log(res);
}

six(4);