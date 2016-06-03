package listener;

import bean.LogEvents;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.AreaTransferencia;
import view.ProcurarProdutoJIF;

public class ProcurarProdutoListener implements ActionListener {
    private LogEvents logEvents = new LogEvents();

    private ProcurarProdutoJIF procurarProduto;
    private AreaTransferencia clipboard;

    public ProcurarProdutoListener(ProcurarProdutoJIF procurarProduto) {
        this.procurarProduto = procurarProduto;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        switch (e.getActionCommand()) {
            case "campoReferencia":
                procurarProduto.ProcurarReferencia();
                break;

            case "copiarProcurarProduto":
                if (!procurarProduto.getReferencia().isEmpty()) {
                    clipboard.copy(procurarProduto.getReferencia());
                }
                break;

            case "cancelarProcurarProduto":
                procurarProduto.setVisible(false);
                procurarProduto.apagarCampos();
                break;

        }
    }
}
