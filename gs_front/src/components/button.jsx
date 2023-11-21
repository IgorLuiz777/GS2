
import './components.scss'

export default function Button(props) {

    return(
        <div className="button">
            <button type={props.type} onChange={props.onChange}>{props.nome}</button>
        </div>
    )
}