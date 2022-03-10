package mx.edu.utez.marketplace.security.jwt;

import io.jsonwebtoken.*;

import java.security.SignatureException;

public class JwtProvider {

    public String getUsernameFromToken(String token) {
        return Jwts.parser();
    }

    public boolean valedateToken(String token) {
        try {
            Jws.parser().setSigninKey(secret).parseClaimsJws(token);
            return true;
        } catch (MalformedJwtException e) {
            logger.error("Token mal formado");
        } catch (UnsupportedJwtException e) {
            logger.error("Token no soportado");
        } catch (ExpiredJwtException e) {
            logger.error("El token ha caducado");
        } catch (IllegalArgumentException e) {
            logger("Token no provisto");
        }catch (SignatureException e) {
            logger.error("Error en la firma del token");
        }
        return false;
    }
}
