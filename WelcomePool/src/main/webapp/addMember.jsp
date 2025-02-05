<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="utf-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <meta name="description" content="">
  <meta name="author" content="">

  <title>Mood of the month</title>

  <!-- Bootstrap CSS -->
  <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/bootstrap.min.css" />

  <!-- Custom CSS -->
  <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/style.css" />

  <!-- Custom Fonts -->
  <link href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" rel="stylesheet" type="text/css">

</head>

<body>

<div id="wrapper">

  <!-- Navigation -->
  <nav class="navbar navbar-default navbar-static-top container-fluid" role="navigation" style="margin-bottom: 0">
    <div class="navbar-header">
      <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
        <span class="sr-only">Toggle navigation</span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
      </button>
      <a class="navbar-brand" href="admin">Mood of the month</a>
    </div>
    <!-- /.navbar-header -->

    <ul class="nav navbar-top-links navbar-right">
      <li class="dropdown">
        <a class="dropdown-toggle navlink" data-toggle="dropdown" href="#">
          <i class="fa fa-gear fa-fw"></i> Manage MOTMs <i class="fa fa-caret-down"></i>
        </a>
        <ul class="dropdown-menu dropdown-user">
          <li><a href="addMember"><i class="fa fa-user fa-fw"></i> Add Member</a>
          </li>
          <li><a href="edit_motm.html"><i class="fa fa-calendar fa-fw"></i> Change MOTM Template</a>
          </li>
        </ul>
      </li>
    </ul>
  </nav>

  <div id="page-wrapper" class="container-fluid">
    <div class="row">
      <div class="col-lg-12">
        <h1 class="page-header">Add Member</h1>
      </div>
      <!-- /.col-lg-12 -->
    </div>
    <!-- /.row -->
    <div class="row">
      <div class="col-lg-10 col-lg-offset-1">
        <!-- /.panel -->
        <div class="panel panel-default">
          <div class="panel-body">
            <div class="row">
              <div class="col-xs-12">
                <form name="memberForm" action="addMember" method="post">
                  <div class="form-group">
                    <label for="name">Name</label>
                    <input type="text" class="input-lg form-control" id="name" name="name" placeholder="Nom">
                  </div>
                  <div class="form-group">
                    <label for="email">Email</label>
                    <input type="email" class="input-lg form-control" id="email" name="email" placeholder="Email Address">
                  </div>
                  <div class="form-group">
                    <label for="birthdate">Birthdate</label>
                    <input type="text" class="input-lg form-control" id="birthdate" name="birthdate" placeholder="DD/MM/YYYY">
                  </div>

                  <div class="text-right">
                    <button type="submit" class="btn btn-lg btn-primary">Save</button>
                  </div>
                </form>
              </div>
            </div>
            <!-- /.row -->
          </div>
          <!-- /.panel-body -->
        </div>
        <!-- /.panel -->
      </div>
      <!-- /.col-lg-12 -->
    </div>
    <!-- /.row -->
  </div>
  <!-- /#page-wrapper -->

</div>
<!-- /#wrapper -->
<footer class="footer">
  <div class="container">
    <div class="row text-center">
      Resourcepool &bullet; 2017
    </div>
  </div>
</footer>

<!-- jQuery -->
<script src="${pageContext.request.contextPath}/js/jquery-3.1.1.min.js"></script>

<!-- Bootstrap Core JavaScript -->
<script src="${pageContext.request.contextPath}/js/bootstrap.min.js"></script>

</body>

</html>
