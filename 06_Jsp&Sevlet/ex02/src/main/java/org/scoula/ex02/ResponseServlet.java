package org.scoula.ex02; // 기존 예제와 동일한 패키지로 가정합니다.

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// 과제 이미지에 명시된 URL 패턴 "/respons"로 서블릿을 매핑합니다.
@WebServlet("/respons")
public class ResponseServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        // 1. 응답 컨텐츠 타입 및 문자셋 설정 (한글 깨짐 방지)
        // 클라이언트(웹 브라우저)에게 전송할 데이터의 종류가 HTML이며,
        // 사용된 문자 인코딩 방식이 UTF-8임을 알립니다.
        // 이 설정은 PrintWriter 객체를 얻기 전에 호출되어야 합니다[5].
        response.setContentType("text/html;charset=UTF-8"); // [2][3][6][8]

        // 2. 응답을 위한 PrintWriter 객체 얻기
        // PrintWriter는 문자 단위로 데이터를 출력하는 스트림입니다.
        PrintWriter out = response.getWriter(); // [2]

        // 3. HTML 응답 내용 작성
        // 과제에서 요청한 "ResponseServlet 요청 성공" 텍스트를 출력합니다.
        // 웹 페이지로 올바르게 표시하기 위해 기본적인 HTML 구조를 포함할 수 있습니다.
        // 여기서는 과제 이미지에 나온 텍스트를 그대로 출력합니다.
        out.println("ResponseServlet 요청 성공");

        // (선택 사항) 보다 완전한 HTML 페이지로 구성하려면 다음과 같이 작성할 수 있습니다:
        /*
        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Response Servlet</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("ResponseServlet 요청 성공");
        out.println("</body>");
        out.println("</html>");
        */
    }
}
