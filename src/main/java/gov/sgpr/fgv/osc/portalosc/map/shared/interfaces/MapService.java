package gov.sgpr.fgv.osc.portalosc.map.shared.interfaces;

import gov.sgpr.fgv.osc.portalosc.map.shared.model.BoundingBox;
import gov.sgpr.fgv.osc.portalosc.map.shared.model.Coordinate;
import gov.sgpr.fgv.osc.portalosc.map.shared.model.OscCoordinate;
import gov.sgpr.fgv.osc.portalosc.user.shared.exception.RemoteException;

import java.util.Set;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

/**
 * @author victor
 * 
 *         Inteface de acesso às informações do mapa.
 * 
 */
@RemoteServiceRelativePath("mapService")
public interface MapService extends RemoteService {

	/**
	 * @param minValue
	 *            Menor valor da página de busca
	 * @param maxValue
	 *            Maior valor da página de busca
	 * @return Coleção de OSCs do intervalo definido
	 * @throws RemoteException
	 * @deprecated
	 */
	OscCoordinate[] getOSCCoordinates(int minValue, int maxValue)
			throws RemoteException;

	/**
	 * @return Quantidade de OSCs carregadas no servidor
	 * @throws RemoteException
	 * @deprecated
	 */
	int getOSCCoordinatesSize() throws RemoteException;

	/**
	 * @param locationCode
	 *            Código da localidade (Região, estado ou município)
	 * @param minValue
	 *            Menor valor da página de busca
	 * @param maxValue
	 *            Maior valor da página de busca
	 * @return Coleção de OSCs do intervalo definido
	 * @throws RemoteException
	 * @deprecated
	 */
	OscCoordinate[] getOSCCoordinates(int locationCode, int minValue,
			int maxValue) throws RemoteException;

	/**
	 * @param locationCode
	 *            Código da localidade (Região, estado ou município)
	 * @return Quantidade de OSCs carregadas no servidor
	 * @throws RemoteException
	 * @deprecated
	 */
	int getOSCCoordinatesSize(int locationCode) throws RemoteException;

	/**
	 * @param bbox
	 *            Retângulo envolvente que delimita a busca
	 * @param width
	 *            largura em pixels
	 * @param height
	 *            altura em pixels
	 * @param all
	 *            busca todas as OSCs e não somente OSCs ativas
	 * @return Coleção de coordenadas que pode ser um cluster de elementos ou
	 *         apenas 1 elementos.
	 * @throws RemoteException
	 */
	Coordinate[] getOSCCoordinates(BoundingBox bbox, int width, int height,
			boolean all) throws RemoteException;

	/**
	 * @param bbox
	 *            Retângulo envolvente que delimita a busca
	 * @param zoomLevel
	 *            nível de zoom
	 * @param all
	 *            busca todas as OSCs e não somente OSCs ativas
	 * @return Coleção de coordenadas
	 * @throws RemoteException
	 */
	Coordinate[] getOSCCoordinates(BoundingBox bbox, int zoomLevel,
			boolean all) throws RemoteException;

	/**
	 * @param bbox
	 *            Retângulo envolvente que delimita a busca
	 * @param all
	 *            busca todas as OSCs e não somente OSCs ativas
	 * @return Coleção de Coordenadas de OSC
	 * @throws RemoteException
	 */
	Set<OscCoordinate> getOSCCoordinates(BoundingBox bbox, boolean all)
			throws RemoteException;
}
