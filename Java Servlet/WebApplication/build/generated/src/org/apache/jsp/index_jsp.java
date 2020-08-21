package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>First Web Application</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css\">\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js\"></script>\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js\"></script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <nav class=\"navbar navbar-inverse\">\n");
      out.write("            <div class=\"container-fluid\">\n");
      out.write("                <div class=\"navbar-header\">\n");
      out.write("                    <button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\"#myNavbar\">\n");
      out.write("                        <span class=\"icon-bar\"></span>\n");
      out.write("                        <span class=\"icon-bar\"></span>\n");
      out.write("                        <span class=\"icon-bar\"></span>                        \n");
      out.write("                    </button>\n");
      out.write("                    <a class=\"navbar-brand\" href=\"#\">Learning English</a>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"collapse navbar-collapse\" id=\"myNavbar\">\n");
      out.write("                    <ul class=\"nav navbar-nav\">\n");
      out.write("                        <li class=\"active\"><a href=\"#\">Home</a></li>\n");
      out.write("                        <li><a href=\"#\">Courses</a></li>\n");
      out.write("                        <li><a href=\"#\">About</a></li>\n");
      out.write("                        <li><a href=\"#\">Contact</a></li>\n");
      out.write("                    </ul>\n");
      out.write("                    <ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("                        <li><a href=\"#\">Sign Up</a></li>\n");
      out.write("                        <li><a href=\"#\"><span class=\"glyphicon glyphicon-log-in\"></span> Login</a></li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </nav>\n");
      out.write("\n");
      out.write("        <div class=\"container-fluid text-center\">    \n");
      out.write("            <div class=\"row content\">\n");
      out.write("                <div class=\"col-sm-2 sidenav\" style=\"margin-top: 100px\">\n");
      out.write("                    <p><a href=\"#\">Link</a></p>\n");
      out.write("                    <p><a href=\"#\">Link</a></p>\n");
      out.write("                    <p><a href=\"#\">Link</a></p>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-sm-8 text-left\"> \n");
      out.write("                    <h1>4 Reasons Why Learning English is so Important</h1>\n");
      out.write("                    <p>English is the language of science, of aviation, computers, diplomacy, and tourism. Knowing English increases your chances of getting a good job in a multinational company within your home country or for finding work abroad. It’s also the language of international communication, the media and the internet, so learning English is important for socialising and entertainment as well as work!</p>\n");
      out.write("                    <img alt=\"image1\" src=\"https://www.elc-schools.com/files/BannerImageMobile20/Images/1/Lewes-Trip.jpg\" width=\"100%\"/>\n");
      out.write("                    <p>Let’s look at the top 4 reasons why studying English is so important:</p>\n");
      out.write("                    <br/>\n");
      out.write("                    <h3>1. English is the Language of International Communication</h3>\n");
      out.write("                    <br/>\n");
      out.write("                    <p>English may not be the most spoken language in the world, but it is the official language of 53 countries and spoken by around 400 million people across the globe. Being able to speak English is not just about being able to communicate with native English speakers, it is the most common second language in the world. If you want to speak to someone from another country then the chances are that you will both be speaking English to do this.\n");
      out.write("                        <br/>\n");
      out.write("                        The British Council projects that by 2020 two billion people in the world will be studying English. Learning English is important as it enables you to communicate easily with your fellow global citizens. When you study English at ELC schools, you will be making friends with people from lots of different countries, using English as your common language!</p>\n");
      out.write("                    <br/>\n");
      out.write("                    <h3>2. English is the Language of Business</h3>\n");
      out.write("                    <br/>\n");
      out.write("                    <p>English is the dominant business language and it has become almost a necessity for people to speak English if they are to enter a global workforce. Research from all over the world shows that cross-border business communication is most often conducted in English and many international companies expect employees to be fluent in English. Global companies such as Airbus, Daimler-Chrysler, Fast Retailing, Nokia, Renault, Samsung, SAP, Technicolor, and Microsoft in Beijing, have mandated English as their official corporate language. In addition, in 2010 the company Rakuten, a Japanese cross between Amazon and eBay, made it mandatory for their 7,100 Japanese employees to be able to speak English. The importance of learning English in the international marketplace cannot be understated - learning English really can change your life.</p>\n");
      out.write("                    <br/>\n");
      out.write("                    <h3>3. Speaking English gives you Access to a World of Entertainment</h3>\n");
      out.write("                    <br/>\n");
      out.write("                    <p>Many of the world’s top films, books and music are published and produced in English. Therefore, by learning English you will have access to a great wealth of entertainment and will be able to have a greater cultural understanding. If you speak English, you won't need to rely on translations and subtitles anymore to enjoy your favourite books, songs, films and TV shows. Watching movies and television programmes in the English language is also a great and fun way to learn it! At ELC we encourage students to participate in the social programme to practice English outside a class environment. Activities include watching popular English films, sports, art galleries, museums, trips and excursions to local and historical areas. The programme is designed to encourage students to use and learn English in British culture.</p>\n");
      out.write("                    <br/>\n");
      out.write("                    <h3>4. Learning English gives you Access to more of the Internet</h3>\n");
      out.write("                    <br/>\n");
      out.write("                    <img alt=\"image2\" src=\"https://www.elc-schools.com/files/AgentImage/Images/1/ELC-Brighton-Computer-Room.jpg\" width=\"100%\"/> \n");
      out.write("                    <br/>\n");
      out.write("                    <p>According to a report by Education First, English is the language of the internet. An estimated 565 million people use the internet every day, and an estimated 52 percent of the world’s most visited websites are displayed in the English language. Learning English is important as it gives you access to over half the content on the internet. Knowing how to read English will allow you access to billions of pages of information which may not be otherwise available!</p>\n");
      out.write("\n");
      out.write("                    <hr>\n");
      out.write("                    \n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-sm-2 sidenav\">\n");
      out.write("                    <div class=\"well\">\n");
      out.write("                        <img alt=\"ads1\" src=\"https://static.gamehub.vn/img/files/2018/08/14/HKGH-Duy-Manh-cuc-ngau-trong-bo-anh-quang-cao-1.jpg\" width=\"100%\" height=\"100%\"/>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"well\">\n");
      out.write("                        <p>ADS</p>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <footer class=\"container-fluid text-center\">\n");
      out.write("            <p>Footer Text</p>\n");
      out.write("        </footer>\n");
      out.write("        <table style=\"margin-left: 100px\">\n");
      out.write("            <form action=\"/action_page.php\" style=\"margin: 100px\">\n");
      out.write("                <tr>\n");
      out.write("                    <td><label for=\"fname\">First name:</label></td>\n");
      out.write("                    <td><input type=\"text\" id=\"fname\" name=\"fname\" value=\"John\"><br></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td><label for=\"lname\">Last name:</label></td>\n");
      out.write("                    <td><input type=\"text\" id=\"lname\" name=\"lname\" value=\"Doe\"><br><br></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td></td>\n");
      out.write("                    <td></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td><label>Choose answers: </label></td>\n");
      out.write("                    <td><input type=\"checkbox\" id=\"vehicle1\" name=\"vehicle1\" value=\"Bike\">\n");
      out.write("                        <label for=\"vehicle1\"> I have a bike</label>\n");
      out.write("                        <input type=\"checkbox\" id=\"vehicle2\" name=\"vehicle2\" value=\"Car\">\n");
      out.write("                        <label for=\"vehicle2\"> I have a car</label>\n");
      out.write("                        <input type=\"checkbox\" id=\"vehicle3\" name=\"vehicle3\" value=\"Boat\">\n");
      out.write("                        <label for=\"vehicle3\"> I have a boat</label><br></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td><input type=\"submit\"></td>\n");
      out.write("                </tr>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("            </form> \n");
      out.write("        </table>\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
