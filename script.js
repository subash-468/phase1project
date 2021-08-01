var data=[];

function adddata(ev) {
    ev.preventDefault();
    var userdata={
        fname: document.getElementById('fn').value,
        lname: document.getElementById('ln').value,
        age: document.getElementById('age').value,
        dob: document.getElementById('dob').value,
        address: document.getElementById('address').value,
        mobile: document.getElementById('mobile').value
    }
    data.push(userdata);
    document.forms[0].reset();

    console.warn('added' , {data} );
    let pre = document.querySelector('#msg pre');
    pre.textContent = '\n' + JSON.stringify(data, '\t', 2);

    localStorage.setItem('userdata', JSON.stringify(data) );
}

document.addEventListener('DOMContentLoaded',()=>{
    document.getElementById('btn').addEventListener('click', adddata);
});

let output = document.getElementById('display');
function checkdata(ev) {
    var user=document.getElementById('username').value;
    var original= document.getElementById('mail').value;
    let result=original.localeCompare(user);
    output.innerHTML = result == 0 ? 'Valid user' : 'Invalid User';
    
}

document.addEventListener('DOMContentLoaded',()=>{
    document.getElementById('logbtn').addEventListener('click', checkdata);
});