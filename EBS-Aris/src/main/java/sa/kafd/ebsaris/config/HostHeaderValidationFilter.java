package sa.kafd.ebsaris.config;

import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpFilter;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//@Component
public class HostHeaderValidationFilter extends HttpFilter {

//    private final Set<String> allowedHosts;
//
//    public HostHeaderValidationFilter(@Value("${allowed.hosts}") String allowedHostsProperty) {
//        this.allowedHosts = Stream.of(allowedHostsProperty.split(","))
//                .collect(Collectors.toSet());
//    }
//
//    @Override
//    protected void doFilter(HttpServletRequest request, HttpServletResponse response, FilterChain chain)
//            throws IOException, ServletException {
//        String host = request.getHeader("Host");
//        host = host != null ? host.toUpperCase() : null;
//
//        if (host != null && !allowedHosts.contains(host)) {
//            response.sendError(HttpServletResponse.SC_BAD_REQUEST, "Invalid Host Header");
//            return;
//        }
//
//        chain.doFilter(request, response);
//    }

}
