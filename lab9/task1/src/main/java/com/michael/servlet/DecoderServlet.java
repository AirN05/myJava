package com.michael.servlet;

import org.apache.commons.codec.binary.Base64;
import org.apache.commons.compress.compressors.xz.XZCompressorInputStream;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.ByteArrayInputStream;
import java.io.IOException;

@WebServlet("/decode")
public class DecoderServlet extends HttpServlet
{
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        try
        {
            String src = req.getParameter("src");

            byte[] bytes = Base64.decodeBase64(src);
            byte[] ans = new byte[100];


            ByteArrayInputStream input = new ByteArrayInputStream(bytes);
            XZCompressorInputStream xzInput = new XZCompressorInputStream(input);

            xzInput.read(ans);
            xzInput.close();

            String result = new String(ans);

            req.setAttribute("result", result);
////

        }
        catch (Exception e)
        {
            req.setAttribute("result", "Incorrect line!");
        }

        req.getRequestDispatcher("index.jsp").forward(req, resp);
    }
}
