
var arr = [];
class Books {
    constructor(bName, bQuant, bCost) {
        this.bName = bName;
        this.bQuant = bQuant;
        this.bCost = bCost;
    }
}

arr[0] = new Books("Alpha", 4, 200);
arr[1] = new Books("Bravo", 3, 300);

function addBook() {
    var name = document.getElementById("i1").value;
    var quant = document.getElementById("i2").value;
    var cost = document.getElementById("i3").value;

    arr.push(new Books(name, quant, cost));
    document.getElementById("i1").value = "";
    document.getElementById("i2").value = "";
    document.getElementById("i3").value = "";
    alert("Book Added");

}

function del() {
    var name = document.getElementById("i4").value;
    for (let x of arr) {
        if (x.bName === name) {
            var index = arr.indexOf(x);
            if (index >= 0) {
                arr.splice(index, 1);
            }
        }
    }
    document.getElementById("i4").value = "";
    alert("Book deleted")
}

function srch() {
    var name = document.getElementById("i3").value;
    // alert(name);
    for (let x of arr) {
        if (x.bName === name) {
            document.getElementById('p1').innerHTML = ("Book Name: " + x.bName + " Quantity: " + x.bQuant + " Cost: " + x.bCost);
        }
    }
    document.getElementById("i3").value = "";
}


function editBook() {
    var name = document.getElementById("q1").value;
    for (let x of arr) {
        if (x.bName === name) {
            x.bQuant = document.getElementById("q2").value;
        }
    }
    document.getElementById("q1").value = "";
    document.getElementById("q2").value = "";
    alert("Book edited");
}