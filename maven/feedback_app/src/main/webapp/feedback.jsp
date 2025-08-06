<!doctype html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Feedback Page</title>
    <%@include file="comp/links.jsp"%>
  </head>
  <body>
        <%@include file="header.jsp"%>

        <div class="container feedback-container">
            <h2>Feedback Form</h2>
            <form action="<%=request.getContextPath()%>/feedback" method="post">
                <!-- Name -->
                <div class="mb-3">
                    <label for="name" class="form-label">Full Name</label>
                    <input type="text" name="name" class="form-control" id="name" placeholder="Enter your name" required>
                </div>
                <!-- Email -->
                <div class="mb-3">
                    <label for="email" class="form-label">Email Address</label>
                    <input type="email" name="email" class="form-control" id="email" placeholder="Enter your email" required>
                </div>
                <!-- Feedback -->
                <div class="mb-3">
                    <label for="feedback" class="form-label">Your Feedback</label>
                    <textarea class="form-control" name="feedback" id="feedback" rows="4" placeholder="Write your feedback here..." required></textarea>
                </div>
                <!-- Rating -->
                <div class="mb-3">
                    <label for="rating" class="form-label">Rate Us</label>
                    <select class="form-select" name="rating" id="rating" required>
                        <option selected disabled value="">Choose...</option>
                        <option value="1">1 - Very Poor</option>
                        <option value="2">2 - Poor</option>
                        <option value="3">3 - Average</option>
                        <option value="4">4 - Good</option>
                        <option value="5">5 - Excellent</option>
                    </select>
                </div>
                <!-- Submit Button -->
                <div class="text-center">
                    <button type="submit" class="btn btn-submit">Submit Feedback</button>
                </div>
            </form>
        </div>

        <%@include file="comp/script.jsp"%> <!-- Moved inside <body> -->

  </body>
</html>
