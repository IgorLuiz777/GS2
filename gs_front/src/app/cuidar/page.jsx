
import { Card } from '@/components/card'
import './cuidar.scss'
import Link from 'next/link'

export default function Cuidar() {

    return (
        <main>
            <div className='content_cuidar'>
                <div className='cuidar01'>
                    <div className='texto_cuidar'>
                        <h2>Cuide de Você, Cuide dos Outros</h2>
                        <p>Em um cenário onde a saúde é uma prioridade coletiva, torna-se crucial adotar medidas preventivas para resguardar não apenas a nós mesmos, mas toda a comunidade. Diante das ameaças de doenças transmissíveis como meningite, COVID-19, influenza, sarampo e poliomielite, cada ação preventiva que tomamos contribui para a construção de um ambiente mais seguro. </p>
                    </div>
                    <img src="cuide-se(1)(1).png" alt="home img" width={500} />
                </div>
                <div className='metas'>
                    <h2>Medidas de Presenção:</h2>
                    <div className='cards'>
                        <Card title="Vacinação Regular" text="Mantenha suas vacinas em dia, seguindo as recomendações do calendário de vacinação oficial para cada faixa etária. Esteja atento às campanhas de vacinação sazonais e específicas para doenças virais transmissíveis." />
                        <Card title="Informação Confiável" text="Consulte fontes confiáveis de informação para se manter atualizado sobre as últimas orientações e recomendações de saúde. Evite compartilhar informações não verificadas que contribuem para a disseminação de desinformação." />
                        <Card title="Monitoramento de Sintomas" text="Fique atento a sintomas como febre, tosse, dificuldade respiratória e outros relacionados a doenças transmissíveis. Realize testes de diagnóstico em lugares especializados conforme necessário e siga as orientações de profissionais de saúde." />
                    </div>
                </div>
                <h3 className='h3_servicos'>Ao adotarmos medidas preventivas, estamos trilhando um caminho sólido em direção à segurança e ao bem-estar coletivo. Diante das ameaças constantes de doenças transmissíveis, cada passo que damos em direção à prevenção é uma contribuição valiosa para um ambiente mais protegido.</h3>
                <img src='doctor_phone.png' />
            </div>
        </main>
    )
}