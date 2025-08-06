<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Modern Contact Form</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">
    <link href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0/css/all.min.css" rel="stylesheet">
    <style>
        .gradient-header {
            background: linear-gradient(45deg, #6a11cb, #2575fc);
            color: white;
            border-radius: 15px 15px 0 0;
        }
        
        .form-container {
            background: white;
            border-radius: 15px;
            box-shadow: 0 10px 30px rgba(0,0,0,0.1);
            overflow: hidden;
        }

        .floating-label {
            position: relative;
            margin-bottom: 1.5rem;
        }

        .floating-label input {
            height: 50px;
            padding-top: 28px;
            border: 2px solid #e0e0e0;
            transition: all 0.3s ease;
        }

        .floating-label input:focus {
            border-color: #6a11cb;
            box-shadow: none;
        }

        .floating-label label {
            position: absolute;
            top: 15px;
            left: 15px;
            color: #666;
            transition: all 0.3s ease;
            pointer-events: none;
        }

        .floating-label input:focus ~ label,
        .floating-label input:not(:placeholder-shown) ~ label {
            top: 5px;
            left: 15px;
            font-size: 12px;
            color: #6a11cb;
        }

        .animated-button {
            background: linear-gradient(45deg, #6a11cb, #2575fc);
            border: none;
            color: white;
            padding: 12px 30px;
            border-radius: 8px;
            transition: transform 0.3s ease, box-shadow 0.3s ease;
        }

        .animated-button:hover {
            transform: translateY(-2px);
            box-shadow: 0 5px 15px rgba(106, 17, 203, 0.4);
        }

        .form-icon {
            position: absolute;
            right: 15px;
            top: 50%;
            transform: translateY(-50%);
            color: #666;
        }
    </style>
</head>
<body class="bg-light">

<div class="container py-5">
    <div class="row justify-content-center">
        <div class="col-md-8 col-lg-6">
            <div class="form-container">
                <div class="gradient-header p-4 text-center">
                    <h2><i class="fas fa-paper-plane me-2"></i>Contact Us</h2>
                    <p class="mb-0">We'd love to hear from you!</p>
                </div>

                <form class="p-4" action="processform" method="post">
                    <div class="floating-label">
                        <input type="text" class="form-control" id="name" name="name" placeholder=" ">
                        <label for="name"><i class="fas fa-user me-2"></i>Full Name</label>
                        <i class="fas fa-user form-icon"></i>
                    </div>

                    <div class="floating-label">
                        <input type="email" class="form-control" id="email" name="email" placeholder=" ">
                        <label for="email"><i class="fas fa-envelope me-2"></i>Email Address</label>
                        <i class="fas fa-envelope form-icon"></i>
                    </div>

                    <div class="floating-label">
                        <textarea class="form-control" id="message" name="message" rows="4" placeholder=" " style="height: auto; padding-top: 28px;"></textarea>
                        <label for="message"><i class="fas fa-comment me-2"></i>Your Message</label>
                    </div>

                    <div class="form-check mb-4">
                        <input class="form-check-input" type="checkbox" id="newsletter">
                        <label class="form-check-label" for="newsletter">
                            Subscribe to our newsletter
                        </label>
                    </div>

                    <div class="d-grid">
                        <button type="submit" class="animated-button">
                            <i class="fas fa-paper-plane me-2"></i>Send Message
                        </button>
                    </div>
                </form>
            </div>
        </div>
    </div>
</div>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>