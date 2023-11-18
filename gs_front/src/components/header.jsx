import Link from "next/link";
import './components.scss'

export default function header() {

    return(
        <div className="content_header">
            <header>
                <nav>
                    <ul>
                        <li><Link href={'/'}>TechCare 4 All</Link></li>
                        <li><Link href={'/servicos'}>Serviços</Link></li>
                        <li><Link href={'/produtos'}>Produtos</Link></li>
                        <li><Link href={'/contato'}>Contatate-nos</Link></li>
                        <li><Link href={'#'} className={"login"}>Login</Link> <Link href={'#'} className={"cadastro"}>Cadastro</Link></li>                   
                    </ul>
                </nav>
            </header>
        </div>
    )
}