

import { Card } from '@/components/card'
import './servicos.scss'

export default function Servicos() {

    return (
        <main>
            <div className="content_servicos">
                <div className="servicos01">
                    <img src="family2(1).png" alt="familia" width={450} />
                    <div className="texto_servicos">
                        <h2>Descubra uma Nova Era de Cuidados com a Saúde!</h2>
                        <p>Bem-vindo à nossa página de serviços, onde a inovação se encontra com o bem-estar. Nossos principais recursos foram cuidadosamente projetados para oferecer a você e aos seus entes queridos uma experiência excepcional de rastreamento de saúde e prevenção de doenças.</p>
                    </div>
                </div>
                <div className="servicos02">
                    <h3>Principais Recursos:</h3>
                    <div className="cards">
                        <Card title="💉 Registre sua Vacinação" text="Mantenha um histórico detalhado e acessível das suas vacinas, fortalecendo sua imunização contra diversas doenças." />
                        <Card title="📍 Encontre Centros de Saúde Confiáveis" text="Encontre os melhores centros de saúde e serviços médicos próximos a você, com informações confiáveis de outros usuários." />
                        <Card title="👥 Conecte-se com Amigos" text="Mantenha-se próximo dos seus amigos e familiares, compartilhando informações importantes sobre saúde e bem-estar." />
                    </div>
                </div>
                <p className='texto02_servicos'>Navegue pelos nossos serviços e descubra como podemos ajudar você a trilhar o caminho de uma vida mais saudável e segura. Seu bem-estar é a nossa prioridade.</p>
                <img src="health2.png" alt="" />
            </div>

        </main>
    )
}