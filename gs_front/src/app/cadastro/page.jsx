
import Link from 'next/link'
import './cadastro.scss'

export default function Cadastro() {

    return(
        <main>
            <div className="content_cadastro">
                <div className='div_img'>
                    <img src="cadastro(1).png" alt="" />
                </div>
                <div className='form'>
                    <h3>Cadastro</h3>
                    <form action="">
                        <label htmlFor="name">Nome</label>
                        <input type="text" name="name" id="name" placeholder='Digite o seu nome' required/>

                        <label htmlFor="email">Email</label>
                        <input type="email" name="email" id="email" placeholder='Digite o seu email' required/>

                        <label htmlFor="cpf">CPF</label>
                        <input type="text" name="cpf" id="cpf" placeholder='Digite o seu cpf' required/>

                        <label htmlFor="phone">Celular</label>
                        <input type="tel" name="phone" id="phone" placeholder='Digite o seu número' required/>

                        <label htmlFor="password">Senha</label>
                        <input type="password" name="password" id="password" placeholder='Digite a sua senha' required/>

                        <button>Criar Cadastro</button>

                        <p>Já tem um cadastro? <Link href={'/login'}>Login</Link></p>
                    </form>
                </div>           
            </div>
        </main>
    )
}