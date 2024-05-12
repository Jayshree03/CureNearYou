<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="utf-8">
    <title>Lab Tech SignUp | Cure Near You - The Healthcare Assistance</title>
	<%@include file="labtechheader.jsp" %>
	<div class="container-fluid py-5">
        <div class="container">
            <div class="row gx-5">
                <div class="col-lg-6 mb-5 mb-lg-0">
                    <div class="mb-4">
                        <h5 class="d-inline-block text-primary text-uppercase border-bottom border-5">Doctor SignUp</h5>
                        <h1 class="display-4">WelCome Back!</h1>
                    </div>
                    <p class="mb-5">Welcome to Cure Near You - Healthcare Assistance, your one-stop solution for all your healthcare needs. Our platform aims to provide seamless access to healthcare services, including appointment scheduling, lab test details, medication management, and emergency ambulance assistance. With Cure Near You, you can connect with healthcare providers, access medical information, and receive timely assistance whenever you need it. SignUp now to experience convenient and efficient healthcare services.</p>
                    <a class="btn btn-outline-primary rounded-pill py-3 px-5" href="">Read More</a>
                </div>
                <div class="col-lg-6">
                    <div class="bg-light text-center rounded p-5">
                        <h1 class="mb-4">Lab Tech SignUp</h1>
                        <form action="LabTechSignUp" method="post">
                            <div class="row g-3">
                                <div class="col-12 col-sm-12">
                                    <!-- select class="form-select bg-white border-0" style="height: 55px;">
                                        <option selected>Choose Category</option>
                                        <option value="1">Patient</option>
                                        <option value="2">Doctor</option>
                                        <option value="3">Admin</option>
                                        <option value="3">Hospital</option>
                                    </select-->
                                    <div class="nav-item dropdown">
                            			<a href="#" class="nav-link dropdown-toggle" data-bs-toggle="dropdown">Choose Role</a>
                            			<div class="dropdown-menu m-0">
                                		<a href="../signup.jsp" class="dropdown-item">Patient</a>
                                		<a href="../doctor/doctorsignup.jsp" class="dropdown-item">Doctor</a>
                                		<a href="../hospital/hospitalsignup.jsp" class="dropdown-item">Hospital</a>
                                		<a href="./labtechsignup.jsp" class="dropdown-item">LabTech</a>
                                		<a href="../pharmacy/pharmacysignup.jsp" class="dropdown-item">Pharmacy</a>
                            		</div>
                       	 		</div>
                         	</div>
                         		<div class="col-12 col-sm-12">
                                    <input type="hidden" class="form-control bg-white border-0" name="type" value="4" style="height: 55px;">
                                </div>
                                <div class="col-12 col-sm-6">
                                    <input type="text" class="form-control bg-white border-0" name="hname" placeholder="Name" style="height: 55px;">
                                </div>
                                <div class="col-12 col-sm-6">
                                    <input type="email" class="form-control bg-white border-0" name="huserid" placeholder="Email/UserId" style="height: 55px;">
                                </div>
                                <div class="col-12 col-sm-6">
                                    <input type="text" class="form-control bg-white border-0" name="hmob" placeholder="Phone No." style="height: 55px;">
                                </div>
                                <div class="col-12 col-sm-6">
                                    <input type="text" class="form-control bg-white border-0" name="hadd" placeholder="Address" style="height: 55px;">
                                </div> 
                                <div class="col-12 col-sm-12">
                                    <input type="password" class="form-control bg-white border-0" name="hpass" placeholder="Password" style="height: 55px;">
                                </div>
                                <div class="col-12 col-sm-12">
                                    <input type="password" class="form-control bg-white border-0" name="hcpass" placeholder="Confirm Password" style="height: 55px;">
                                </div>
                                <div class="col-12">
                                    <button class="btn btn-primary w-100 py-3" type="submit">Sign Up</button>
                                </div>
                            </div>
                        </form>
                    </div>
                </div>
            </div>
        </div>
    </div>


<%@include file="labtechfooter.jsp" %>
</body>
</html>