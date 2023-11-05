function doctor() {
    let form=document.getElementsByClassName('logForm')[1]
    let s=`<!-- Names given for backend -->
    <input type="text" name="RegName" id="Name" placeholder="Name" required>
    <input type="email" name="RegEmail" id="Email" placeholder="E-Mail ID" required>
    <input type="tel" name="RegPhone" id="Phone" placeholder="Phone No." required>
    <input type="number" name="RegAge" id="Age" placeholder="Age" required>
    <select name="Gender" id="Gender" required>                           
        <option value="Male">Male</option>
        <option value="Female">Female</option>
        <option value="Others">Others</option>
    </select>
    <input type="text" name="Specialization" id="special" placeholder="Specialization/Degree" required>
    <input type="password" name="LogPass" id="userPass" placeholder="Password" required>
    <input type="password" name="LogPass2" id="userPass2" placeholder="Confirm Password" required>
    <!-- mainain password security -->                  
    <input type="submit" value="Get Started" id="subBtn">`
    form.innerHTML=s
    let image=document.body.style
    image.backgroundImage="url('../Image/hospi7.jpg')"
}

function patient() {
    let form=document.getElementsByClassName('logForm')[1]
    let s=`<!-- Names given for backend -->
    <input type="text" name="RegName" id="Name" placeholder="Name" required>
    <input type="email" name="RegEmail" id="Email" placeholder="E-Mail ID" required>
    <input type="tel" name="RegPhone" id="Phone" placeholder="Phone No." required>
    <input type="number" name="RegAge" id="Age" placeholder="Age" required>
    <select name="Gender" id="Gender" required>                           
        <option value="Male">Male</option>
        <option value="Female">Female</option>
        <option value="Others">Others</option>
    </select>
    <input type="password" name="LogPass" id="userPass" placeholder="Password" required>
    <input type="password" name="LogPass2" id="userPass2" placeholder="Confirm Password" required>
    <!-- mainain password security -->                  
    <input type="submit" value="Get Started" id="subBtn">`
    form.innerHTML=s
    let image=document.body.style
    image.backgroundImage="url('../Image/hospi10.jpg')"
}

function pharmacy() {
    let form=document.getElementsByClassName('logForm')[1]
    let s=`<input type="text" name="RegName" id="Name" placeholder="Name" required>
    <input type="text" name="RegEmail" id="Email" placeholder="E-Mail ID" required>
    <input type="email" name="RegAddress" id="Address" placeholder="Address" required>
    <input type="tel" name="RegPhone" id="Phone" placeholder="Phone No." required>
    <input type="text" name="RegLic" id="License" placeholder="License No." required>
    <input type="password" name="LogPass" id="userPass" placeholder="Password" required>
    <input type="password" name="LogPass2" id="userPass2" placeholder="Confirm Password" required>
    <!-- mainain password security -->                  
    <input type="submit" value="Get Started" id="subBtn">`
    form.innerHTML=s
    let image=document.body.style
    image.backgroundImage="url('../Image/hospi20.png')"
}

function hospital() {
    let form=document.getElementsByClassName('logForm')[1]
    let s=`<!-- Names given for backend -->
    <input type="text" name="RegName" id="Name" placeholder="Hospital Name" required>
    <input type="text" name="RegAddress" id="Address" placeholder="Hospital Address" required>
    <input type="tel" name="RegPhone" id="Phone" placeholder="Phone No." required>
    <input type="email" name="RegEmail" id="Email" placeholder="E-Mail ID" required>
    <input type="number" name="TotalBeds" id="Beds" placeholder="Total No. of Beds Available" required>
    <input type="password" name="LogPass" id="userPass" placeholder="Password" required>
    <input type="password" name="LogPass2" id="userPass2" placeholder="Confirm Password" required>
    <!-- mainain password security -->                  
    <input type="submit" value="Get Started" id="subBtn">`
    form.innerHTML=s
    let image=document.body.style
    image.backgroundImage="url('../Image/hospi13.jpg')"
}
patient()
var type=document.getElementById('type')
console.log(type.value)
function run(){
    console.log(type.value)
    if (type.value==="Doctor") {
        doctor()
    }
    else if (type.value=="Patient") {
        patient()
    }
    else if (type.value=="Pharmacy") {
        pharmacy()
    }
    else if (type.value=="Hospital") {
        hospital()
    }
}