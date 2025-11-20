package ex.com.atividadeQ1;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;

public class EmissorDecoratorComCompressao extends EmissorDecorator {
    public EmissorDecoratorComCompressao(Emissor emissor) {
        super(emissor);
    }

    public void envia(String mensagem) {
        String mensagemComprimida;
        try {
            System.out.println("Enviando mensagem comprimida: ");
            mensagemComprimida = comprime(mensagem);
        } catch (IOException e) {
            mensagemComprimida = mensagem;
        }
        this.getEmissor().envia(mensagemComprimida);
    }

    private String comprime(String mensagem) throws IOException {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        DeflaterOutputStream dout = new DeflaterOutputStream(out, new Deflater());
        dout.write(mensagem.getBytes());
        dout.close();
        return new String(out.toByteArray());
    }
}

