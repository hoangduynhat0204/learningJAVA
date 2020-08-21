<%-- 
    Document   : index
    Created on : May 26, 2020, 8:14:45 PM
    Author     : Hoang Duy Nhat
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>First Web Application</title>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
    </head>
    <body>
        <nav class="navbar navbar-inverse">
            <div class="container-fluid">
                <div class="navbar-header">
                    <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar">
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>                        
                    </button>
                    <a class="navbar-brand" href="#">Learning English</a>
                </div>
                <div class="collapse navbar-collapse" id="myNavbar">
                    <ul class="nav navbar-nav">
                        <li class="active"><a href="#">Home</a></li>
                        <li><a href="#">Courses</a></li>
                        <li><a href="#">About</a></li>
                        <li><a href="#">Contact</a></li>
                    </ul>
                    <ul class="nav navbar-nav navbar-right">
                        <li><a href="#">Sign Up</a></li>
                        <li><a href="#"><span class="glyphicon glyphicon-log-in"></span> Login</a></li>
                    </ul>
                </div>
            </div>
        </nav>

        <div class="container-fluid text-center">    
            <div class="row content">
                <div class="col-sm-2 sidenav" style="margin-top: 100px">
                    <p><a href="#">Link</a></p>
                    <p><a href="#">Link</a></p>
                    <p><a href="#">Link</a></p>
                </div>
                <div class="col-sm-8 text-left"> 
                    <h1>4 Reasons Why Learning English is so Important</h1>
                    <p>English is the language of science, of aviation, computers, diplomacy, and tourism. Knowing English increases your chances of getting a good job in a multinational company within your home country or for finding work abroad. It’s also the language of international communication, the media and the internet, so learning English is important for socialising and entertainment as well as work!</p>
                    <img alt="image1" src="https://www.elc-schools.com/files/BannerImageMobile20/Images/1/Lewes-Trip.jpg" width="100%"/>
                    <p>Let’s look at the top 4 reasons why studying English is so important:</p>
                    <br/>
                    <h3>1. English is the Language of International Communication</h3>
                    <br/>
                    <p>English may not be the most spoken language in the world, but it is the official language of 53 countries and spoken by around 400 million people across the globe. Being able to speak English is not just about being able to communicate with native English speakers, it is the most common second language in the world. If you want to speak to someone from another country then the chances are that you will both be speaking English to do this.
                        <br/>
                        The British Council projects that by 2020 two billion people in the world will be studying English. Learning English is important as it enables you to communicate easily with your fellow global citizens. When you study English at ELC schools, you will be making friends with people from lots of different countries, using English as your common language!</p>
                    <br/>
                    <h3>2. English is the Language of Business</h3>
                    <br/>
                    <p>English is the dominant business language and it has become almost a necessity for people to speak English if they are to enter a global workforce. Research from all over the world shows that cross-border business communication is most often conducted in English and many international companies expect employees to be fluent in English. Global companies such as Airbus, Daimler-Chrysler, Fast Retailing, Nokia, Renault, Samsung, SAP, Technicolor, and Microsoft in Beijing, have mandated English as their official corporate language. In addition, in 2010 the company Rakuten, a Japanese cross between Amazon and eBay, made it mandatory for their 7,100 Japanese employees to be able to speak English. The importance of learning English in the international marketplace cannot be understated - learning English really can change your life.</p>
                    <br/>
                    <h3>3. Speaking English gives you Access to a World of Entertainment</h3>
                    <br/>
                    <p>Many of the world’s top films, books and music are published and produced in English. Therefore, by learning English you will have access to a great wealth of entertainment and will be able to have a greater cultural understanding. If you speak English, you won't need to rely on translations and subtitles anymore to enjoy your favourite books, songs, films and TV shows. Watching movies and television programmes in the English language is also a great and fun way to learn it! At ELC we encourage students to participate in the social programme to practice English outside a class environment. Activities include watching popular English films, sports, art galleries, museums, trips and excursions to local and historical areas. The programme is designed to encourage students to use and learn English in British culture.</p>
                    <br/>
                    <h3>4. Learning English gives you Access to more of the Internet</h3>
                    <br/>
                    <img alt="image2" src="https://www.elc-schools.com/files/AgentImage/Images/1/ELC-Brighton-Computer-Room.jpg" width="100%"/> 
                    <br/>
                    <p>According to a report by Education First, English is the language of the internet. An estimated 565 million people use the internet every day, and an estimated 52 percent of the world’s most visited websites are displayed in the English language. Learning English is important as it gives you access to over half the content on the internet. Knowing how to read English will allow you access to billions of pages of information which may not be otherwise available!</p>

                    <hr>
                    
                </div>
                <div class="col-sm-2 sidenav">
                    <div class="well">
                        <img alt="ads1" src="https://static.gamehub.vn/img/files/2018/08/14/HKGH-Duy-Manh-cuc-ngau-trong-bo-anh-quang-cao-1.jpg" width="100%" height="100%"/>
                    </div>
                    <div class="well">
                        <p>ADS</p>
                    </div>
                </div>
            </div>
        </div>

        <footer class="container-fluid text-center">
            <p>Footer Text</p>
        </footer>
        <table style="margin-left: 100px">
            <form action="/action_page.php" style="margin: 100px">
                <tr>
                    <td><label for="fname">First name:</label></td>
                    <td><input type="text" id="fname" name="fname" value="John"><br></td>
                </tr>
                <tr>
                    <td><label for="lname">Last name:</label></td>
                    <td><input type="text" id="lname" name="lname" value="Doe"><br><br></td>
                </tr>
                <tr>
                    <td></td>
                    <td></td>
                </tr>
                <tr>
                    <td><label>Choose answers: </label></td>
                    <td><input type="checkbox" id="vehicle1" name="vehicle1" value="Bike">
                        <label for="vehicle1"> I have a bike</label>
                        <input type="checkbox" id="vehicle2" name="vehicle2" value="Car">
                        <label for="vehicle2"> I have a car</label>
                        <input type="checkbox" id="vehicle3" name="vehicle3" value="Boat">
                        <label for="vehicle3"> I have a boat</label><br></td>
                </tr>
                <tr>
                    <td><input type="submit"></td>
                </tr>





            </form> 
        </table>

    </body>
</html>
