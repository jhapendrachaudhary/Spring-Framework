//package com.JwtImplementation.jwt.service;
//
//import io.jsonwebtoken.Jwts;
//import io.jsonwebtoken.security.Keys;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.stereotype.Service;
//
//import javax.crypto.SecretKey;
//import java.util.Date;
//import java.util.Map;
//
//@Service
//public class JWTService {
//
//    @Value("${jwt.secret}")
//    private String secretKey;
//
//    @Value("${jwt.expiration.access}")
//    private long accessTokenExpiration;
//
//    @Value("${jwt.expiration.refresh}")
//    private long refreshTokenExpiration;
//
//    public String generateAccessToken(Map<String, Object> extraClaims, UserDetails userDetails) {
//        return buildToken(extraClaims, userDetails.getUsername(), accessTokenExpiration);
//    }
//
//    public String generateRefreshToken(UserDetails userDetails) {
//        return buildToken(Map.of(), userDetails.getUsername(), refreshTokenExpiration);
//    }
//
//    private String buildToken(Map<String, Object> extraClaims, String subject, long expiration) {
//        return Jwts.builder()
//                .claims(extraClaims)
//                .subject(subject)
//                .issuedAt(new Date(System.currentTimeMillis()))
//                .expiration(new Date(System.currentTimeMillis() + expiration))
//                .signWith(getSignKey())
//                .compact();
//    }
//
//    private SecretKey getSignKey() {
//        byte[] keyBytes = secretKey.getBytes();
//        return Keys.hmacShaKeyFor(keyBytes);
//    }
//}